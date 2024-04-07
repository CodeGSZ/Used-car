module.exports = {
    devServer: {
        port: 8082,
        // 配置代理
        proxy: {
            '/': {
                target: 'http://localhost:8080',            //目标地址
                chageOrigin: true,                          //改变源地址
                ws: true,                                   //开启浏览器跨域
                pathRewrite: {
                    '^/': ''                             //重写项目地址
                }
            }
        }
    }
}