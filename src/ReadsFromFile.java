
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadsFromFile {
    List<Case> caseList = new ArrayList();

    public ReadsFromFile() {
    }

    public List readFromFile(String file) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            Throwable var3 = null;

            try {
                for(String line = reader.readLine(); line != null; line = reader.readLine()) {
                    String[] caseValue = line.split("!");
                    Case aCase = new Case(caseValue[0], caseValue[1], Importance.getByName(caseValue[2]), Boolean.parseBoolean(caseValue[3]));
                    this.caseList.add(aCase);
                }
            } catch (Throwable var15) {
                var3 = var15;
                throw var15;
            } finally {
                if (reader != null) {
                    if (var3 != null) {
                        try {
                            reader.close();
                        } catch (Throwable var14) {
                            var3.addSuppressed(var14);
                        }
                    } else {
                        reader.close();
                    }
                }

            }
        } catch (IOException var17) {
        }

        return this.caseList;
    }

    public List<Case> getCaseList() {
        return this.caseList;
    }
}
