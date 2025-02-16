package JUnit.Basic_JUnit.Performance_Testing_Using_Timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class LongTaskTest
{
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test will fail if it exceeds 2 seconds
    void testLongRunningTaskTimeout() {
        LongTask.longRunningTask();
    }
}
