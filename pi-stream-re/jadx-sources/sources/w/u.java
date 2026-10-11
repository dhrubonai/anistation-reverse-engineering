package w;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f10744a;

    static {
        new HashSet();
    }

    public u(Context context) {
        this.f10744a = (NotificationManager) context.getSystemService("notification");
    }
}
