import React, { useState } from 'react';
import './LoginSignup.css';
import user_icon from '../Assets/person.png';
import email_icon from '../Assets/email.png';
import password_icon from '../Assets/password.png';

const LoginSignup = () => {
    const [action, setAction] = useState("Login");
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const handleLogin = async () => {
        try {
            const response = await fetch('https://your-api-url.com/users/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ email, password }),
            });
            const data = await response.json();
            console.log("Login successful:", data);
        } catch (error) {
            console.error("Login error:", error);
        }
    };

    const handleSignUp = async () => {
        try {
            const response = await fetch('https://your-api-url.com/users/register', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ name, email, password }),
            });
            const data = await response.json();
            console.log("Sign Up successful:", data);
        } catch (error) {
            console.error("Sign Up error:", error);
        }
    };

    const handleSubmit = () => {
        if (action === "Login") {
            handleLogin();
        } else if (action === "Sign Up") {
            handleSignUp();
        }
    };

    return (
        <div className='container'>
            <div className='header'>
                <div className='text'>{action}</div>
                <div className='underline'></div>
            </div>
            <div className='inputs'>
                {action === "Login" ? null : (
                    <div className='input'>
                        <img src={user_icon} alt='' />
                        <input
                            type='text'
                            placeholder="Name"
                            value={name}
                            onChange={(e) => setName(e.target.value)}
                        />
                    </div>
                )}
                <div className='input'>
                    <img src={email_icon} alt='' />
                    <input
                        type='email'
                        placeholder="Email id"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                    />
                </div>
                <div className='input'>
                    <img src={password_icon} alt='' />
                    <input
                        type='password'
                        placeholder="Password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                    />
                </div>
                {action === "Login" ? (
                    <div className="forgot-password">
                        Lost Password? <span>Click here!</span>
                    </div>
                ) : null}
                <div className="submit-container">
                    <div
                        className={action === "Login" ? "submit gray" : "submit"}
                        onClick={() => setAction("Sign Up")}
                    >
                        Sign Up
                    </div>
                    <div
                        className={action === "Sign Up" ? "submit gray" : "submit"}
                        onClick={() => setAction("Login")}
                    >
                        Login
                    </div>
                </div>
                <div className="submit-btn" onClick={handleSubmit}>
                    {action === "Login" ? "Login" : "Sign Up"}
                </div>
            </div>
        </div>
    );
};

export default LoginSignup;
