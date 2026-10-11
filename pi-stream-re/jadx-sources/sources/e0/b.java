package e0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3298e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3300b;

    /* renamed from: c, reason: collision with root package name */
    public int f3301c;

    /* renamed from: d, reason: collision with root package name */
    public char f3302d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f3298e[i10] = Character.getDirectionality(i10);
        }
    }

    public b(CharSequence charSequence) {
        this.f3299a = charSequence;
        this.f3300b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f3301c - 1;
        CharSequence charSequence = this.f3299a;
        char charAt = charSequence.charAt(i10);
        this.f3302d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f3301c);
            this.f3301c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f3301c--;
        char c6 = this.f3302d;
        if (c6 < 1792) {
            return f3298e[c6];
        }
        return Character.getDirectionality(c6);
    }
}
