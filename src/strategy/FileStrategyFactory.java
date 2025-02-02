package strategy;

public class FileStrategyFactory {
    FileStrategy createFileStrategy(FileType fileType) {
        return switch (fileType) {
            case PDF -> new PdfFileStrategy();
            case CSV -> new CsvFileStrategy();
            case EXCEL -> new ExcelFileStrategy();
            default -> throw new RuntimeException("Something went wrong.");
        };
    }
}
