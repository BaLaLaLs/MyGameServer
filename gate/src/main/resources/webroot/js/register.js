const useStyles = makeStyles((theme) => ({
    paper: {
        marginTop: theme.spacing(8),
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
    },
    avatar: {
        margin: theme.spacing(1),
        backgroundColor: theme.palette.secondary.main,
    },
    form: {
        width: '100%', // Fix IE 11 issue.
        marginTop: theme.spacing(1),
    },
    submit: {
        margin: theme.spacing(3, 0, 2),
    },
}));

function App() {
    const classes = useStyles();
    console.log(classes.paper);
    return (
        <ThemeProvider theme={theme}>
            <Container maxWidth="sm">
                <div className={classes.paper}>
                    <Typography component="h1" variant="h5">
                        注册
                    </Typography>
                    <form className={classes.form} noValidate>
                        <TextField
                            variant="outlined"
                            margin="normal"
                            required
                            fullWidth
                            id="username"
                            label="账号"
                            name="username"
                            autoFocus
                        />
                        <TextField
                            variant="outlined"
                            margin="normal"
                            required
                            fullWidth
                            name="password"
                            label="密码"
                            type="password"
                            id="password"
                            autoComplete="current-password"
                        />
                        <Button
                            // type="submit"
                            fullWidth
                            variant="contained"
                            color="primary"
                            onClick={async () => {
                                console.log(await axios.post('/api/register', {
                                    username: 'liushun',
                                    password: 'pass'
                                }))
                            }}
                            className={classes.submit}
                        >
                            注册
                        </Button>
                    </form>
                </div>
            </Container>
        </ThemeProvider>
    );
}

ReactDOM.render(
    <App/>,
    document.querySelector('#app'),
);