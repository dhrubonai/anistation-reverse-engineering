package z7;

import android.content.Context;
import c9.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y8.d0;
import y8.e0;
import y8.f0;
import y8.w;
import y8.y;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f12130a = Pattern.compile("\\d{2}:\\d{2}:\\d{2}[,.]\\d{3}\\s*-->");

    public static void a(Context context, ArrayList arrayList, String str, HashMap hashMap, e eVar) {
        String str2;
        d0 c6;
        f0 f0Var;
        if (arrayList.isEmpty()) {
            return;
        }
        w p3 = c.p();
        int min = Math.min(3, arrayList.size());
        try {
            eVar.b(0, min);
        } catch (Exception unused) {
        }
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            a8.g gVar = (a8.g) arrayList.get(i11);
            if (gVar != null && (str2 = gVar.f195a) != null && !str2.isEmpty()) {
                try {
                    y yVar = new y();
                    yVar.d(str2);
                    yVar.b("User-Agent", "Mozilla/5.0");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        try {
                            yVar.b((String) entry.getKey(), (String) entry.getValue());
                        } catch (Exception unused2) {
                        }
                    }
                    c6 = new i(p3, yVar.a(), false).c();
                    f0Var = c6.f11697x;
                } catch (Exception unused3) {
                }
                if (f0Var != null) {
                    try {
                        if (c6.f()) {
                            k9.f F = ((e0) f0Var).f11706c.F();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[32768];
                                    long j4 = 0;
                                    do {
                                        int read = F.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                        j4 += read;
                                    } while (j4 <= 5242880);
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    F.close();
                                    c6.close();
                                    if (byteArray != null && byteArray.length >= 10) {
                                        String b10 = b(byteArray);
                                        File b11 = c.b(context);
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(str);
                                            sb.append("_sub_");
                                            sb.append(i11);
                                            sb.append(b10);
                                            File file = new File(b11, sb.toString());
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            try {
                                                fileOutputStream.write(byteArray);
                                                fileOutputStream.close();
                                                if (file.length() < 10) {
                                                    file.delete();
                                                } else {
                                                    i10++;
                                                    eVar.b(i10, min);
                                                }
                                            } finally {
                                            }
                                        } catch (Exception unused4) {
                                            continue;
                                        }
                                    }
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                        Throwable th2 = th;
                                        if (F != null) {
                                            try {
                                                try {
                                                    F.close();
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                try {
                                                    c6.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        }
                                        throw th2;
                                        break;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                c6.close();
            }
        }
    }

    public static String b(byte[] bArr) {
        try {
            boolean z9 = false;
            String str = new String(bArr, 0, Math.min(bArr.length, 8192), StandardCharsets.UTF_8);
            if (str.startsWith("\ufeff")) {
                str = str.substring(1);
            }
            String trim = str.trim();
            if (!trim.startsWith("WEBVTT") && f12130a.matcher(str).find()) {
                if (str.contains("-->")) {
                    if (trim.contains(".")) {
                        try {
                            Matcher matcher = Pattern.compile("(\\d{2}:\\d{2}:\\d{2})([,.])(\\d{3})\\s*-->").matcher(str);
                            if (matcher.find()) {
                                z9 = ".".equals(matcher.group(2));
                            }
                        } catch (Exception unused) {
                        }
                        if (z9) {
                            return ".vtt";
                        }
                        return ".srt";
                    }
                    return ".srt";
                }
                return ".srt";
            }
        } catch (Exception unused2) {
        }
        return ".vtt";
    }
}
