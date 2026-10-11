package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class tv implements vs1, rw5, g25 {
    public String x;

    public tv(String str, byte b) {
        switch (b) {
            case 3:
                if (!TextUtils.isEmpty(str)) {
                    this.x = str;
                    return;
                } else {
                    p65.b();
                    throw null;
                }
            default:
                str.getClass();
                this.x = str;
                return;
        }
    }

    public static CharSequence e(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(e(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.x);
                    sb.append(e(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        int i = ww7.k;
        kw7 kw7Var = new kw7((p76) obj2);
        xw7 xw7Var = (xw7) ((yw7) obj).m();
        String str = this.x;
        Parcel K = xw7Var.K();
        tm7.c(K, kw7Var);
        K.writeString(str);
        K.writeString("");
        K.writeString(null);
        xw7Var.M(K, 11);
    }

    @Override // defpackage.vs1
    public boolean c(CharSequence charSequence, int i, int i2, gl6 gl6Var) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.x)) {
            gl6Var.c = (gl6Var.c & 3) | 4;
            return false;
        }
        return true;
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    @Override // defpackage.rw5
    public Iterator u(i90 i90Var, CharSequence charSequence) {
        return new pw5(this, i90Var, charSequence, (byte) 1);
    }

    @Override // defpackage.vs1
    public Object b() {
        return this;
    }

    public /* synthetic */ tv(String str, char c) {
        this.x = str;
    }
}
