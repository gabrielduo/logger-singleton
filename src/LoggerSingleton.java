public class LoggerSingleton {

    private static LoggerSingleton uniqueInstance; // A única instância do Logger

    private StringBuilder logs; // Aqui ficam os logs

    private LoggerSingleton() {
        logs = new StringBuilder(); // Inicializa os logs
    }

    public static LoggerSingleton getInstance() {
        if (uniqueInstance == null) { // Se ainda não foi criado
            uniqueInstance = new LoggerSingleton(); // Cria
        }
        return uniqueInstance; // Retorna
    }

    public void addLog(String message) {
        logs.append(message).append("\n"); // Adiciona o log
    }

    public String showLogs() {
        return logs.toString(); // Mostra os logs
    }
}
