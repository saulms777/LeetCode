void generate(int n, char *str, int i, int o, int c, char **arr, int *size) {
    if (i == 2 * n) {
        str[i] = '\0';
        arr[(*size)++] = strdup(str);
        return;
    }
    if (o < n) {
        str[i] = '(';
        generate(n, str, i + 1, o + 1, c, arr, size);
    }
    if (o > c) {
        str[i] = ')';
        generate(n, str, i + 1, o, c + 1, arr, size);
    }
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** generateParenthesis(int n, int *returnSize) {
    *returnSize = 0;
    char **arr = malloc(sizeof(char *) * 10000);
    char *str = malloc(sizeof(char) * (2 * n + 1));
    generate(n, str, 0, 0, 0, arr, returnSize);
    free(str);
    return arr;
}