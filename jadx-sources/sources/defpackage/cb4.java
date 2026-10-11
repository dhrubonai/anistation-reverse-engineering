package defpackage;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class cb4 {
    public final Bundle a;
    public IconCompat b;
    public final q25[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public cb4(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q25[] q25VarArr, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if ((i == -1 ? ((Icon) iconCompat.b).getType() : i) == 2) {
                this.f = iconCompat.b();
            }
        }
        this.g = gb4.c(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = q25VarArr;
        this.d = z;
        this.e = z2;
    }
}
