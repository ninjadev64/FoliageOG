package com.amansprojects.foliage;

public class Logger {
    public enum LogLevel {
        ERROR("\u001b[31m[ERROR]"),
        WARN("\u001b[33m[WARN ]"),
        INFO("\u001b[0m[INFO ]"),
        TRACE("\u001b[37m[TRACE]");
        public final String prefix;

        private LogLevel(String prefix) {
            this.prefix = prefix;
        }
    }
    public static LogLevel level = LogLevel.INFO;

    public static String log(LogLevel l, String s) {
        if (l.compareTo(level) >= 0) System.out.println(l.prefix + " " + s + "\u001b[0m");
        return s;
    }

    public static String error(String s) { return log(LogLevel.ERROR, s); }
    public static String warn(String s) { return log(LogLevel.WARN, s); }
    public static String info(String s) { return log(LogLevel.INFO, s); }
    public static String trace(String s) { return log(LogLevel.TRACE, s); }
}