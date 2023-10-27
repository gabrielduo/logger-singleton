public class TesteLogger {
    public static void main(String[] args) {
        LoggerSingleton logger1 = LoggerSingleton.getInstance(); // Pega a instância
        logger1.addLog("Primeiro log."); // Adiciona um log

        LoggerSingleton logger2 = LoggerSingleton.getInstance(); // Pega a instância de novo
        logger2.addLog("Segundo log."); // Adiciona outro log

        System.out.println(logger1.showLogs()); // Mostra os logs
    }
}