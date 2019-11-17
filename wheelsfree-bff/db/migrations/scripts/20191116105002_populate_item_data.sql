-- Migration SQL that makes the change goes here.
INSERT INTO item (name, description, price, quantity, image_url) VALUES ('Fancy Drone', 'Good base model drone.', 100.25, 50, 'https://images.pexels.com/photos/336232/pexels-photo-336232.jpeg');
INSERT INTO item (name, description, price, quantity, image_url) VALUES ('Super Fancy Drone', 'The best drone money can buy.', 229.99, 10, 'https://images.pexels.com/photos/442587/pexels-photo-442587.jpeg');
INSERT INTO item (name, description, price, quantity, image_url) VALUES ('Fancier Drone', 'Starting to become an advanced drone user.', 159.85, 25, 'https://images.pexels.com/photos/2100075/pexels-photo-2100075.jpeg');

-- //@UNDO
-- SQL to undo the change goes here.

DELETE FROM item WHERE id = 1;
DELETE FROM item WHERE id = 2;
DELETE FROM item WHERE id = 3;
