package x3;

/* loaded from: classes.dex */
public final class z implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f11278a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11279b = true;

    public z(Appendable appendable) {
        this.f11278a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) {
        boolean z9 = this.f11279b;
        Appendable appendable = this.f11278a;
        if (z9) {
            this.f11279b = false;
            appendable.append("  ");
        }
        this.f11279b = c6 == '\n';
        appendable.append(c6);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z9 = this.f11279b;
        Appendable appendable = this.f11278a;
        boolean z10 = false;
        if (z9) {
            this.f11279b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z10 = true;
        }
        this.f11279b = z10;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
