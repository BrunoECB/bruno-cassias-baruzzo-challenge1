const database = 'blogApp';
const posts = 'Posts';
const comments = 'Comments';
use(database);
db.createCollection(posts);
db.createCollection(comments);
const document = {
    post_id: "1",
    title: "",
    content: "",
    author: "",
    date: ""
};
const document1 = {
    comment_id: "1",
    post_id: "1",
    content: "",
    author: "",
    date:""
};
db[posts].insertOne(document);
db[comments].insertOne(document1)
db[comments].createIndex({ post_id: 1 });
