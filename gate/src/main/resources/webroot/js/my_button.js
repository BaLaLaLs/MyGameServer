function App() {
    return (
        <Container maxWidth="sm">
            <div style={{ marginTop: 24, }}>
                <FormControl>
                    <InputLabel htmlFor="my-input">Email address</InputLabel>
                    <Input id="my-input" aria-describedby="my-helper-text" />
                    <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
                </FormControl>
                <Button variant="contained">Hello World</Button>
            </div>
        </Container>
    );
}
ReactDOM.render(
    <App/>,
    document.querySelector('#app'),
);