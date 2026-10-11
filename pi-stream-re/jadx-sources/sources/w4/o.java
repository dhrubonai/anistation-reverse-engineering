package w4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10994a;

    /* renamed from: b, reason: collision with root package name */
    public String f10995b;

    public o(String str, int i10) {
        this.f10994a = i10;
        if (i10 != 3) {
            str.getClass();
            this.f10995b = str;
        } else {
            this.f10995b = str;
        }
    }

    public final void a(StringBuilder sb, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f10995b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        switch (this.f10994a) {
            case 3:
                return "<" + this.f10995b + '>';
            default:
                return super.toString();
        }
    }
}
