const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot94sk3/",
            name: "springboot94sk3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot94sk3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "租房管理系统"
        } 
    }
}
export default base
