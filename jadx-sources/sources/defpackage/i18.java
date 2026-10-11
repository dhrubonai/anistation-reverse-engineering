package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class i18 implements q42, jx, d60, td0, lt6, xx1, nw4, z26, d12 {
    public final /* synthetic */ byte x;
    public static final i18 y = new i18(0);
    public static final i18 z = new i18(1);
    public static final i18 A = new i18(2);
    public static final i18 B = new i18(3);
    public static final i18 C = new i18(4);

    public /* synthetic */ i18(byte b) {
        this.x = b;
    }

    public static byte[] K(nw2 nw2Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(nw2Var.size());
        Iterator<E> it = nw2Var.iterator();
        while (it.hasNext()) {
            b31 b31Var = (b31) it.next();
            Bundle b = b31Var.b();
            Bitmap bitmap = b31Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                io3.B(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                b.putByteArray(b31.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(b);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static bm0 N(String str) {
        bm0 bm0Var = new bm0(str);
        bm0.d.put(str, bm0Var);
        return bm0Var;
    }

    @Override // defpackage.xx1
    public void A(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.xx1
    public vx1 B(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // defpackage.q42
    public float C(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.xx1
    public int E() {
        return 1;
    }

    @Override // defpackage.d12
    public bh6 G(int i, int i2) {
        return new vg1();
    }

    @Override // defpackage.xx1
    public boolean J(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public synchronized bm0 L(String str) {
        bm0 bm0Var;
        String str2;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = bm0.d;
            bm0Var = (bm0) linkedHashMap.get(str);
            if (bm0Var == null) {
                if (b06.I(str, "TLS_", false)) {
                    str2 = "SSL_".concat(str.substring(4));
                } else if (b06.I(str, "SSL_", false)) {
                    str2 = "TLS_".concat(str.substring(4));
                } else {
                    str2 = str;
                }
                bm0Var = (bm0) linkedHashMap.get(str2);
                if (bm0Var == null) {
                    bm0Var = new bm0(str);
                }
                linkedHashMap.put(str, bm0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bm0Var;
    }

    public void M(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.td0
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.xx1
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.jx
    public void e(x26 x26Var) {
        x26Var.getClass();
        x26Var.v("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // defpackage.q42
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.nw4
    public Object get() {
        return new lj2(Executors.newSingleThreadExecutor(), (byte) 1);
    }

    @Override // defpackage.xx1
    public wx1 k() {
        throw new IllegalStateException();
    }

    @Override // defpackage.q42
    public float l(float f, long j) {
        return 0.0f;
    }

    @Override // defpackage.xx1
    public cb2 n(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.xx1
    public byte[] o() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.q42
    public float q(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // defpackage.z26
    public a36 r(y26 y26Var) {
        return new mb2((Context) y26Var.c, (String) y26Var.d, (fr0) y26Var.e, y26Var.a, y26Var.b);
    }

    public String toString() {
        switch (this.x) {
            case 24:
                return "REMOVE_FROZEN";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xx1
    public void u(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.q42
    public long y(float f) {
        return 0L;
    }

    @Override // defpackage.xx1
    public byte[] z(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.xx1
    public void release() {
    }

    @Override // defpackage.d12
    public void t() {
    }

    @Override // defpackage.d12
    public void I(hf5 hf5Var) {
    }

    @Override // defpackage.d60
    public long g(long j) {
        return j;
    }

    @Override // defpackage.xx1
    public void v(byte[] bArr) {
    }

    @Override // defpackage.xx1
    public void w(i75 i75Var) {
    }
}
