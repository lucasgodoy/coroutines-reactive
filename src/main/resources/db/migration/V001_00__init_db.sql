CREATE TABLE person (
    id UUID PRIMARY KEY,
    name VARCHAR(128) NOT NULL CHECK (TRIM(name) != ''),
    picture_url VARCHAR(256) CHECK (TRIM(name) != ''),
    birthday DATE NOT NULL,
    gender VARCHAR(10) CHECK (TRIM(gender) != ''),
    postal_code VARCHAR(10) CHECK (TRIM(postal_code) != ''),
    country_code VARCHAR(2) NOT NULL CHECK (TRIM(country_code) != '')
);

INSERT INTO person(id, name, picture_url, birthday, gender, postal_code, country_code)
VALUES
('232ff401-080c-4693-a055-621d8f6cfa8b', 'John', '/john.png', '2000-09-04', 'male', '873902', 'us'),
('ee4cadc8-bcbf-4508-9805-566c53cbd359', 'Mary', '/mary.png', '1999-03-23', 'female', '383722', 'uk'),
('2483ddd1-b0c6-452b-9616-a325f2cbf51f', 'George', '/george.png', '1981-06-14', 'male', '00112292', 'nl'),
('0d11c3ca-f52b-44ee-bd8a-6d1a6c50ff64', 'Martin', '/martin.png', '2010-04-25', 'male', '7823823', 'mx'),
('1e8dc66b-9c7b-4540-97ec-bdcae89814c5', 'Helena', '/helena.png', '1991-02-20', 'female', '2309292', 'es'),
('7b98da07-9453-4daf-af3c-ff4f4e5c5ef7', 'Ana', '/ana.png', '1997-12-03', 'female', '77736372', 'es'),
('d45c48bd-0872-4fbf-b524-1b4165411c60', 'Charles', '/charles.png', '1975-10-14', 'male', '1283723823', 'us'),
('88bea18c-ad8d-4801-8e3d-00ee8b1bb6d5', 'Quentin', '/quentin.png', '1994-09-18', 'male', '463737', 'fr'),
('5071f220-2491-4ec7-90a2-ce469f06d595', 'Amanda', '/amanda.png', '1996-01-21', 'female', '2927393', 'br'),
('4db53d70-6111-43f7-b98a-60795a962134', 'Alice', '/alice.png', '2011-08-07', 'female', '9372992', 'ar');