function App() {
    return (
        <Container maxWidth="sm">
            <div style={{marginTop: 24,}}>
                <FormControl>
                    <InputLabel htmlFor="my-input">账号</InputLabel>
                    <Input id="my-input" aria-describedby="my-helper-text"/>
                    <FormHelperText id="my-helper-text">请输入您的账号</FormHelperText>
                </FormControl>
                <FormControl>
                    <InputLabel htmlFor="my-pass">密码</InputLabel>
                    <Input id="my-pass" aria-describedby="my-helper-text"/>
                    <FormHelperText id="my-helper-text">请输入您的密码</FormHelperText>
                </FormControl>
            </div>
        </Container>
    );
}

ReactDOM.render(
    <App/>,
    document.querySelector('#app'),
);