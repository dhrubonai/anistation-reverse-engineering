package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.bs6;
import defpackage.cs6;
import defpackage.ds6;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(bs6 bs6Var) {
        ?? obj = new Object();
        ds6 ds6Var = obj.a;
        boolean z = true;
        if (bs6Var.e(1)) {
            ds6Var = bs6Var.h();
        }
        obj.a = (IconCompat) ds6Var;
        CharSequence charSequence = obj.b;
        if (bs6Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((cs6) bs6Var).e);
        }
        obj.b = charSequence;
        CharSequence charSequence2 = obj.c;
        if (bs6Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((cs6) bs6Var).e);
        }
        obj.c = charSequence2;
        obj.d = (PendingIntent) bs6Var.g(obj.d, 4);
        boolean z2 = obj.e;
        if (bs6Var.e(5)) {
            if (((cs6) bs6Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        obj.e = z2;
        boolean z3 = obj.f;
        if (!bs6Var.e(6)) {
            z = z3;
        } else if (((cs6) bs6Var).e.readInt() == 0) {
            z = false;
        }
        obj.f = z;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, bs6 bs6Var) {
        bs6Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        bs6Var.i(1);
        bs6Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bs6Var.i(2);
        Parcel parcel = ((cs6) bs6Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bs6Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bs6Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        bs6Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        bs6Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
