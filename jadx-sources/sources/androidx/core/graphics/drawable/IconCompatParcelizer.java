package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bs6;
import defpackage.cs6;
import defpackage.ze0;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.graphics.drawable.IconCompat, java.lang.Object] */
    public static IconCompat read(bs6 bs6Var) {
        ?? obj = new Object();
        obj.a = -1;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        obj.g = null;
        obj.h = IconCompat.k;
        obj.i = null;
        obj.a = bs6Var.f(-1, 1);
        byte[] bArr = obj.c;
        if (bs6Var.e(2)) {
            Parcel parcel = ((cs6) bs6Var).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        obj.c = bArr;
        obj.d = bs6Var.g(obj.d, 3);
        obj.e = bs6Var.f(obj.e, 4);
        obj.f = bs6Var.f(obj.f, 5);
        obj.g = (ColorStateList) bs6Var.g(obj.g, 6);
        String str = obj.i;
        if (bs6Var.e(7)) {
            str = ((cs6) bs6Var).e.readString();
        }
        obj.i = str;
        String str2 = obj.j;
        if (bs6Var.e(8)) {
            str2 = ((cs6) bs6Var).e.readString();
        }
        obj.j = str2;
        obj.h = PorterDuff.Mode.valueOf(obj.i);
        switch (obj.a) {
            case -1:
                Parcelable parcelable = obj.d;
                if (parcelable != null) {
                    obj.b = parcelable;
                    return obj;
                }
                ze0.k("Invalid icon");
                return null;
            case 0:
            default:
                return obj;
            case 1:
            case 5:
                Parcelable parcelable2 = obj.d;
                if (parcelable2 != null) {
                    obj.b = parcelable2;
                    return obj;
                }
                byte[] bArr3 = obj.c;
                obj.b = bArr3;
                obj.a = 3;
                obj.e = 0;
                obj.f = bArr3.length;
                return obj;
            case 2:
            case 4:
            case 6:
                String str3 = new String(obj.c, Charset.forName("UTF-16"));
                obj.b = str3;
                if (obj.a == 2 && obj.j == null) {
                    obj.j = str3.split(":", -1)[0];
                }
                return obj;
            case 3:
                obj.b = obj.c;
                return obj;
        }
    }

    public static void write(IconCompat iconCompat, bs6 bs6Var) {
        bs6Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            bs6Var.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bs6Var.i(2);
            Parcel parcel = ((cs6) bs6Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            bs6Var.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            bs6Var.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            bs6Var.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bs6Var.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            bs6Var.i(7);
            ((cs6) bs6Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bs6Var.i(8);
            ((cs6) bs6Var).e.writeString(str2);
        }
    }
}
