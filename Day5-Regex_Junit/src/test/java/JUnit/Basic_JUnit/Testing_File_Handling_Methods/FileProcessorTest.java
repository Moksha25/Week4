package JUnit.Basic_JUnit.Testing_File_Handling_Methods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest
{
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        new File(TEST_FILE).delete();
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete();
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, this is a test.";

        FileProcessor.writeToFile(TEST_FILE, content);

        String result = FileProcessor.readFromFile(TEST_FILE);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Test content");

        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    void testIOExceptionForNonExistentFile() {
        Exception exception = assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("non_existent_file.txt");
        });

        assertTrue(exception.getMessage().contains("non_existent_file.txt"));
    }
}
