var login = new Vue({
    el : "#app",
    data : {
        username : "",
        password : ""
    },
    methods : {
        login : function () {
            var self = this;
            self.$http.post("/login/checkLogin", {"username" : self.username, "password" : self.password}).then(response => {
                var result = response.body;
                alert(result.code);
        }, response => {
                // error callback
            });
        }
    }
});