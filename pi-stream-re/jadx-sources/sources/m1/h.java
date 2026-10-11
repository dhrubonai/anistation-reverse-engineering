package m1;

import android.net.Uri;
import android.text.TextUtils;
import c1.r0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h implements z1.q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7072a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // z1.q
    public final Object h(Uri uri, h1.j jVar) {
        long j4;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(jVar, q6.e.f9207c)).readLine();
        try {
            Matcher matcher = f7072a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j4 = 1;
                    } else {
                        j4 = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= ((((parseLong2 * 60) + parseLong) * 60) * 1000) * j4;
                }
                return Long.valueOf(time);
            }
            throw r0.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e10) {
            throw r0.b(null, e10);
        }
    }
}
