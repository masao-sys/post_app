/* rolesテーブル */
INSERT IGNORE INTO roles (id, name) VALUES (1, 'ROLE_GENERAL');

/* usersテーブル */
INSERT IGNORE INTO users (id, name, email, password, role_id, enabled) VALUES (1, '田中 太郎', 'taro.tanaka@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 1, true);
INSERT IGNORE INTO users (id, name, email, password, role_id, enabled) VALUES (2, '田中 二郎', 'jiro.tanaka@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', 1, true);
