package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import s3.a;
import s3.b;
import s3.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f782a;
        boolean z9 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f782a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f783b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f9890e);
        }
        remoteActionCompat.f783b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f784c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f9890e);
        }
        remoteActionCompat.f784c = charSequence2;
        remoteActionCompat.f785d = (PendingIntent) aVar.g(remoteActionCompat.f785d, 4);
        boolean z10 = remoteActionCompat.f786e;
        if (aVar.e(5)) {
            if (((b) aVar).f9890e.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        remoteActionCompat.f786e = z10;
        boolean z11 = remoteActionCompat.f787f;
        if (aVar.e(6)) {
            if (((b) aVar).f9890e.readInt() == 0) {
                z9 = false;
            }
            z11 = z9;
        }
        remoteActionCompat.f787f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f782a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f783b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f9890e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f784c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f785d, 4);
        boolean z9 = remoteActionCompat.f786e;
        aVar.i(5);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = remoteActionCompat.f787f;
        aVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
