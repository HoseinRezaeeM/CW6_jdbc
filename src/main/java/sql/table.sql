CREATE  TABLE IF NOT EXISTS users(
                                     user_id SERIAL PRIMARY KEY,
                                     username VARCHAR(50) NOT NULL,
                                     password VARCHAR(50) NOT NULL,
                                     signup_date VARCHAR(50) NOT NULL

)