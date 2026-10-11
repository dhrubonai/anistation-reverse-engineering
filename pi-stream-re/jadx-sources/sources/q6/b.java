package q6;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final char f9202a;

    public b(char c6) {
        this.f9202a = c6;
    }

    @Override // q6.a
    public final boolean b(char c6) {
        if (c6 == this.f9202a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c6 = this.f9202a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c6 & 15);
            c6 = (char) (c6 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
