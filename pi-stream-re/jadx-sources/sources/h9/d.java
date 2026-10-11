package h9;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import r6.h0;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5163a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int min;
        h0.u(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f5161a;
        String loggerName = logRecord.getLoggerName();
        h0.s(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = logRecord.getMessage();
        h0.s(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f5162b.get(loggerName);
        if (str == null) {
            str = o7.k.H1(23, loggerName);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int p12 = o7.j.p1(message, '\n', i11, false, 4);
                if (p12 == -1) {
                    p12 = length;
                }
                while (true) {
                    min = Math.min(p12, i11 + 4000);
                    String substring = message.substring(i11, min);
                    h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= p12) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }
}
