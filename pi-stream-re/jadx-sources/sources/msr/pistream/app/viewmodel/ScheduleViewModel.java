package msr.pistream.app.viewmodel;

import a8.b;
import android.util.Log;
import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import s1.u;
import y7.k;

@HiltViewModel
/* loaded from: classes.dex */
public class ScheduleViewModel extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f7846c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7847d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f7848e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f7849f;

    public ScheduleViewModel(k kVar) {
        c0 c0Var = new c0();
        this.f7845b = c0Var;
        Boolean bool = Boolean.FALSE;
        this.f7846c = new c0(bool);
        this.f7847d = new HashMap();
        this.f7848e = new c0(bool);
        this.f7849f = new c0(null);
        this.f7844a = kVar;
        c0Var.j(f(Calendar.getInstance()));
    }

    public static List b(String str, List list) {
        String format;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                Date g10 = g(bVar);
                if (g10 == null) {
                    format = null;
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                    simpleDateFormat.setTimeZone(j());
                    format = simpleDateFormat.format(g10);
                }
                if (str.equals(format)) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static String c(String str) {
        int i10;
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            simpleDateFormat.setTimeZone(j());
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(j(), locale);
            calendar.setTime(parse);
            int i11 = calendar.get(7);
            if (i11 == 1) {
                i10 = 6;
            } else {
                i10 = i11 - 2;
            }
            calendar.add(5, -i10);
            return "week-" + simpleDateFormat.format(calendar.getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    public static long[] d(String str) {
        int i10;
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            simpleDateFormat.setTimeZone(j());
            Date parse = simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance(j(), locale);
            calendar.setTime(parse);
            int i11 = calendar.get(7);
            if (i11 == 1) {
                i10 = 6;
            } else {
                i10 = i11 - 2;
            }
            calendar.add(5, -i10);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis() / 1000;
            calendar.add(5, 7);
            return new long[]{timeInMillis, calendar.getTimeInMillis() / 1000};
        } catch (Exception unused) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            return new long[]{currentTimeMillis, currentTimeMillis + 604800};
        }
    }

    public static String f(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(j());
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Date g(b bVar) {
        String str;
        if (bVar != null && (str = bVar.f176z) != null && !str.isEmpty()) {
            String trim = bVar.f176z.trim();
            try {
                if (trim.matches("-?\\d+")) {
                    return new Date(Long.parseLong(trim));
                }
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).parse(trim);
            } catch (Exception e10) {
                Log.e("ScheduleVM", "parseAiringAt", e10);
                return null;
            }
        }
        return null;
    }

    public static String h(Calendar calendar) {
        TimeZone j4 = j();
        Locale locale = Locale.US;
        Calendar calendar2 = Calendar.getInstance(j4, locale);
        String f10 = f(calendar);
        if (f10.equals(f(calendar2))) {
            return "TODAY";
        }
        calendar2.add(5, -1);
        if (f10.equals(f(calendar2))) {
            return "YESTERDAY";
        }
        calendar2.add(5, 2);
        if (f10.equals(f(calendar2))) {
            return "TOMORROW";
        }
        return new SimpleDateFormat("EEE", locale).format(calendar.getTime()).toUpperCase(locale);
    }

    public static String i(boolean z9) {
        String str;
        if (z9) {
            str = "EEEE, MMMM d 'at' HH:mm";
        } else {
            str = "EEEE, MMMM d 'at' hh:mm a";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(k()));
        return simpleDateFormat.format(new Date());
    }

    public static TimeZone j() {
        return TimeZone.getTimeZone(k());
    }

    public static String k() {
        String id = TimeZone.getDefault().getID();
        if (id == null || id.isEmpty()) {
            return "Asia/Dhaka";
        }
        return id;
    }

    public final List e(String str) {
        String c6 = c(str);
        c0 c0Var = this.f7849f;
        c0 c0Var2 = this.f7848e;
        if (c6 == null) {
            c0Var2.h(Boolean.FALSE);
            c0Var.h("Invalid date");
            return Collections.emptyList();
        }
        HashMap hashMap = this.f7847d;
        List list = (List) hashMap.get(c6);
        if (list != null) {
            return b(str, list);
        }
        c0Var2.h(Boolean.TRUE);
        try {
            long[] d10 = d(str);
            long j4 = d10[0];
            long j10 = d10[1];
            this.f7844a.f11643a.f3594a.getClass();
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                emptyList = Collections.emptyList();
            }
            Collections.sort(emptyList, new u(this, 1));
            hashMap.put(c6, new ArrayList(emptyList));
            c0Var2.h(Boolean.FALSE);
            c0Var.h(null);
            return b(str, emptyList);
        } catch (Exception e10) {
            Log.e("ScheduleVM", "loadSchedule", e10);
            c0Var2.h(Boolean.FALSE);
            c0Var.h("Could not load schedule");
            throw new RuntimeException("Could not load schedule", e10);
        }
    }
}
