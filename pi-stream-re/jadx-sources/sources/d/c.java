package d;

import android.content.Intent;
import androidx.activity.j;
import r6.h0;

/* loaded from: classes.dex */
public final class c extends a {
    @Override // d.a
    public final Intent a(j jVar, Object obj) {
        Intent intent = (Intent) obj;
        h0.u(jVar, "context");
        h0.u(intent, "input");
        return intent;
    }

    @Override // d.a
    public final Object c(Intent intent, int i10) {
        return new c.a(intent, i10);
    }
}
