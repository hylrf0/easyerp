var SERVER = location.pathname;

var login = new Vue({
    el : "#app",
    data : {
        username : "",
        password : ""
    },
    methods : {
        login : function () {
            var self = this;
            self.$http.post(SERVER + "login/checkLogin", {"username" : self.username, "password" : self.password}).then(response => {
                var result = response.body;
                if (result.success) {
                    alert(result.code);
                } else {
                    alert(result.message);
                }
        }, response => {
                // error callback
            });
        }
    }
});