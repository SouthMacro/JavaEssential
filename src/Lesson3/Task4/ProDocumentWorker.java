package Lesson3.Task4;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public String editDocument() {
        return "Документ отредактирован";
    }

    @Override
    public String saveDocument() {
        return "Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт";
    }
}
