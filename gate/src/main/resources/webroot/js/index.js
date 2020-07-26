const {
    Input,
    CssBaseline,
    TextField,
    FormControlLabel,
    createMuiTheme,
    Grid,
    Typography,
    Container,
    Button,
    makeStyles,
    FormControl,
    Checkbox,
    InputLabel,
    FormHelperText,
    ThemeProvider,
    Link,
} = MaterialUI;

const theme = createMuiTheme({
    palette: {
        primary: {
            main: '#556cd6',
        },
        secondary: {
            main: '#19857b',
        },
        error: {
            main: '#ff0000',
        },
        background: {
            default: '#fff',
        },
    },
});