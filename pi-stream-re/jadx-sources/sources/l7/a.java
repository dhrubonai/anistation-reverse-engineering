package l7;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class a implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final char f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final char f6876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6877c = 1;

    public a(char c6, char c10) {
        this.f6875a = c6;
        this.f6876b = (char) com.bumptech.glide.d.C(c6, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f6875a, this.f6876b, this.f6877c);
    }
}
