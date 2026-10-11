package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p62 {
    public static final p62 x;
    public static final /* synthetic */ p62[] y;

    /* JADX INFO: Fake field, exist only in values array */
    p62 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p62] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p62] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p62] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, p62] */
    static {
        ?? r0 = new Enum("Visible", 0);
        ?? r1 = new Enum("Clip", 1);
        x = r1;
        y = new p62[]{r0, r1, new Enum("ExpandIndicator", 2), new Enum("ExpandOrCollapseIndicator", 3)};
    }

    public static p62 valueOf(String str) {
        return (p62) Enum.valueOf(p62.class, str);
    }

    public static p62[] values() {
        return (p62[]) y.clone();
    }
}
