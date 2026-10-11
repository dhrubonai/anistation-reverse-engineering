package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oo {
    public static final oo A;
    public static final oo B;
    public static final oo C;
    public static final oo D;
    public static final /* synthetic */ oo[] E;
    public static final oo x;
    public static final oo y;
    public static final oo z;

    /* JADX WARN: Type inference failed for: r0v0, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [oo, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [oo, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Paragraph", 0);
        x = r0;
        ?? r1 = new Enum("Span", 1);
        y = r1;
        ?? r2 = new Enum("VerbatimTts", 2);
        z = r2;
        ?? r3 = new Enum("Url", 3);
        A = r3;
        ?? r4 = new Enum("Link", 4);
        B = r4;
        ?? r5 = new Enum("Clickable", 5);
        C = r5;
        ?? r6 = new Enum("String", 6);
        D = r6;
        E = new oo[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static oo valueOf(String str) {
        return (oo) Enum.valueOf(oo.class, str);
    }

    public static oo[] values() {
        return (oo[]) E.clone();
    }
}
