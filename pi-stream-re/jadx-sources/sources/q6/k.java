package q6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class k implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f9216b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f9217c;

    /* renamed from: d, reason: collision with root package name */
    public final a f9218d;

    /* renamed from: x, reason: collision with root package name */
    public int f9221x;

    /* renamed from: a, reason: collision with root package name */
    public int f9215a = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f9220f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9219e = false;

    public k(l lVar, CharSequence charSequence) {
        this.f9218d = lVar.f9222a;
        this.f9221x = lVar.f9224c;
        this.f9217c = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        boolean z9;
        String str;
        int a10;
        CharSequence charSequence;
        a aVar;
        int i10 = this.f9215a;
        if (i10 != 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            int b10 = p.j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 == 2) {
                return false;
            }
            this.f9215a = 4;
            int i11 = this.f9220f;
            while (true) {
                int i12 = this.f9220f;
                if (i12 != -1) {
                    j jVar = (j) this;
                    a10 = ((a) jVar.f9214y.f6453b).a(i12, jVar.f9217c);
                    charSequence = this.f9217c;
                    if (a10 == -1) {
                        a10 = charSequence.length();
                        this.f9220f = -1;
                    } else {
                        this.f9220f = a10 + 1;
                    }
                    int i13 = this.f9220f;
                    if (i13 == i11) {
                        int i14 = i13 + 1;
                        this.f9220f = i14;
                        if (i14 > charSequence.length()) {
                            this.f9220f = -1;
                        }
                    } else {
                        while (true) {
                            aVar = this.f9218d;
                            if (i11 >= a10 || !aVar.b(charSequence.charAt(i11))) {
                                break;
                            }
                            i11++;
                        }
                        while (a10 > i11) {
                            int i15 = a10 - 1;
                            if (!aVar.b(charSequence.charAt(i15))) {
                                break;
                            }
                            a10 = i15;
                        }
                        if (!this.f9219e || i11 != a10) {
                            break;
                        }
                        i11 = this.f9220f;
                    }
                } else {
                    this.f9215a = 3;
                    str = null;
                    break;
                }
            }
            int i16 = this.f9221x;
            if (i16 == 1) {
                a10 = charSequence.length();
                this.f9220f = -1;
                while (a10 > i11) {
                    int i17 = a10 - 1;
                    if (!aVar.b(charSequence.charAt(i17))) {
                        break;
                    }
                    a10 = i17;
                }
            } else {
                this.f9221x = i16 - 1;
            }
            str = charSequence.subSequence(i11, a10).toString();
            this.f9216b = str;
            if (this.f9215a == 3) {
                return false;
            }
            this.f9215a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            this.f9215a = 2;
            String str = this.f9216b;
            this.f9216b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
