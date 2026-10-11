package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n17 {
    public static final n17 A;
    public static final n17 B;
    public static final n17 C;
    public static final n17 D;
    public static final n17 E;
    public static final /* synthetic */ n17[] F;
    public static final n17 x;
    public static final n17 y;
    public static final n17 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, n17] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, n17] */
    static {
        ?? r0 = new Enum("Settings", 0);
        x = r0;
        ?? r1 = new Enum("Server", 1);
        y = r1;
        ?? r2 = new Enum("Playback", 2);
        z = r2;
        ?? r3 = new Enum("Quality", 3);
        A = r3;
        ?? r4 = new Enum("Download", 4);
        B = r4;
        ?? r5 = new Enum("Audio", 5);
        C = r5;
        ?? r6 = new Enum("Subtitle", 6);
        D = r6;
        ?? r7 = new Enum("None", 7);
        E = r7;
        F = new n17[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static n17 valueOf(String str) {
        return (n17) Enum.valueOf(n17.class, str);
    }

    public static n17[] values() {
        return (n17[]) F.clone();
    }
}
