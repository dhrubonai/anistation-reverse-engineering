package x;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
