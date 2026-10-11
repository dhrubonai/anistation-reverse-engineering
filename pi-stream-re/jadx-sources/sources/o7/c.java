package o7;

import h7.p;
import java.util.Iterator;
import r6.h0;

/* loaded from: classes.dex */
public final class c implements n7.c {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f8320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8321b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8322c;

    /* renamed from: d, reason: collision with root package name */
    public final p f8323d;

    public c(CharSequence charSequence, int i10, int i11, i iVar) {
        h0.u(charSequence, "input");
        this.f8320a = charSequence;
        this.f8321b = i10;
        this.f8322c = i11;
        this.f8323d = iVar;
    }

    @Override // n7.c
    public final Iterator iterator() {
        return new b(this);
    }
}
