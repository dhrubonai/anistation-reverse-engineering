package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import s3.a;
import s3.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f789a = aVar.f(iconCompat.f789a, 1);
        byte[] bArr = iconCompat.f791c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f9890e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f791c = bArr;
        iconCompat.f792d = aVar.g(iconCompat.f792d, 3);
        iconCompat.f793e = aVar.f(iconCompat.f793e, 4);
        iconCompat.f794f = aVar.f(iconCompat.f794f, 5);
        iconCompat.f795g = (ColorStateList) aVar.g(iconCompat.f795g, 6);
        String str = iconCompat.f797i;
        if (aVar.e(7)) {
            str = ((b) aVar).f9890e.readString();
        }
        iconCompat.f797i = str;
        String str2 = iconCompat.f798j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f9890e.readString();
        }
        iconCompat.f798j = str2;
        iconCompat.f796h = PorterDuff.Mode.valueOf(iconCompat.f797i);
        switch (iconCompat.f789a) {
            case -1:
                Parcelable parcelable = iconCompat.f792d;
                if (parcelable != null) {
                    iconCompat.f790b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f792d;
                if (parcelable2 != null) {
                    iconCompat.f790b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f791c;
                    iconCompat.f790b = bArr3;
                    iconCompat.f789a = 3;
                    iconCompat.f793e = 0;
                    iconCompat.f794f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f791c, Charset.forName("UTF-16"));
                iconCompat.f790b = str3;
                if (iconCompat.f789a == 2 && iconCompat.f798j == null) {
                    iconCompat.f798j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f790b = iconCompat.f791c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f797i = iconCompat.f796h.name();
        switch (iconCompat.f789a) {
            case -1:
                iconCompat.f792d = (Parcelable) iconCompat.f790b;
                break;
            case 1:
            case 5:
                iconCompat.f792d = (Parcelable) iconCompat.f790b;
                break;
            case 2:
                iconCompat.f791c = ((String) iconCompat.f790b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f791c = (byte[]) iconCompat.f790b;
                break;
            case 4:
            case 6:
                iconCompat.f791c = iconCompat.f790b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f789a;
        if (-1 != i10) {
            aVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f791c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f9890e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f792d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f793e;
        if (i11 != 0) {
            aVar.j(i11, 4);
        }
        int i12 = iconCompat.f794f;
        if (i12 != 0) {
            aVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f795g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f797i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f9890e.writeString(str);
        }
        String str2 = iconCompat.f798j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f9890e.writeString(str2);
        }
    }
}
