#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LEN 1000  // Maximum length of strings

void merge_alternate(char *str1, char *str2, char *str3) {
    int i = 0, j = 0, k = 0;
    
    // Merge characters alternatively
    while (str1[i] != '\0' && str2[j] != '\0') {
        str3[k++] = str1[i++];
        str3[k++] = str2[j++];
    }

    // Append remaining characters from the longer string
    while (str1[i] != '\0') {
        str3[k++] = str1[i++];
    }

    while (str2[j] != '\0') {
        str3[k++] = str2[j++];
    }

    str3[k] = '\0';  // Null-terminate the merged string
}

int main() {
    FILE *file1, *file2, *file3;
    char str1[MAX_LEN], str2[MAX_LEN], str3[2 * MAX_LEN];

    // Open file1.txt for reading
    file1 = fopen("file1.txt", "r");
    if (file1 == NULL) {
        printf("Error: Cannot open file1.txt\n");
        return 1;
    }

    // Open file2.txt for reading
    file2 = fopen("file2.txt", "r");
    if (file2 == NULL) {
        printf("Error: Cannot open file2.txt\n");
        fclose(file1);
        return 1;
    }

    // Read contents of file1.txt and file2.txt
    fgets(str1, MAX_LEN, file1);
    fgets(str2, MAX_LEN, file2);

    // Close input files
    fclose(file1);
    fclose(file2);

    // Remove newline characters if present
    str1[strcspn(str1, "\n")] = '\0';
    str2[strcspn(str2, "\n")] = '\0';

    // Merge strings alternatively
    merge_alternate(str1, str2, str3);

    // Open file3.txt for writing
    file3 = fopen("file3.txt", "w");
    if (file3 == NULL) {
        printf("Error: Cannot open file3.txt\n");
        return 1;
    }

    // Write merged string to file3.txt
    fputs(str3, file3);

    // Close output file
    fclose(file3);

    printf("Merged string written to file3.txt: %s\n", str3);
    return 0;
}
