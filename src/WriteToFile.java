import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class WriteToFile {
    public WriteToFile() {
    }

    public void writesToFile(List<Case> list, String file) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            Throwable var4 = null;

            try {
                for(int i = 0; i < list.size(); ++i) {
                    writer.write(list.get(i) + "\n");
                }
            } catch (Throwable var14) {
                var4 = var14;
                throw var14;
            } finally {
                if (writer != null) {
                    if (var4 != null) {
                        try {
                            writer.close();
                        } catch (Throwable var13) {
                            var4.addSuppressed(var13);
                        }
                    } else {
                        writer.close();
                    }
                }

            }
        } catch (IOException var16) {
        }

    }
}
