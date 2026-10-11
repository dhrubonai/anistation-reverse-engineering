package defpackage;

import com.anistation.model.CoverImage;
import com.anistation.model.Info;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.Recent;
import com.anistation.model.Title;
import com.anistation.model.download.OfflineDownloadMetadata;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class e02 {
    public static final c15 a = new c15();

    public static final String a(String str, boolean z) {
        if (str != null && !uz5.V(str)) {
            if (z) {
                List i0 = uz5.i0(str, new String[]{"_"}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : i0) {
                    if (!uz5.V((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                return yo0.q0(arrayList, " ", null, null, new f01((byte) 16), 30);
            }
            String valueOf = String.valueOf(str.charAt(0));
            valueOf.getClass();
            Locale locale = Locale.ROOT;
            String upperCase = valueOf.toUpperCase(locale);
            upperCase.getClass();
            String lowerCase = str.substring(1).toLowerCase(locale);
            lowerCase.getClass();
            return upperCase.concat(lowerCase);
        }
        return str;
    }

    public static final String b(Title title) {
        if (title == null) {
            return "";
        }
        String english = title.getEnglish();
        if (english == null && (english = title.getRomaji()) == null && (english = title.getNative()) == null) {
            String userPreferred = title.getUserPreferred();
            if (userPreferred == null) {
                return "";
            }
            return userPreferred;
        }
        return english;
    }

    public static final String c(Recent recent) {
        recent.getClass();
        String b = b(recent.getTitle());
        if (a.b(uz5.w0(b).toString())) {
            return b + ": " + recent.getEpisodeNumber();
        }
        if (!uz5.V(b)) {
            return b + ": Episode " + recent.getEpisodeNumber();
        }
        return "New Episode from ".concat(b);
    }

    public static final String d(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            return String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)}, 3));
        }
        return String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public static final String e(long j) {
        String format;
        try {
            ZoneId systemDefault = ZoneId.systemDefault();
            ZonedDateTime atZone = Instant.ofEpochSecond(j).atZone(systemDefault);
            LocalDate localDate = atZone.toLocalDate();
            LocalDate now = LocalDate.now(systemDefault);
            String format2 = atZone.format(DateTimeFormatter.ofPattern("h:mm a"));
            if (a34.i(localDate, now)) {
                format = "Today at " + format2;
            } else if (a34.i(localDate, now.plusDays(1L))) {
                format = "Tomorrow at " + format2;
            } else if (a34.i(localDate, now.minusDays(1L))) {
                format = "Yesterday at " + format2;
            } else {
                long between = ChronoUnit.DAYS.between(now, localDate);
                if (2 <= between && between < 7) {
                    format = localDate.format(DateTimeFormatter.ofPattern("EEEE")) + " at " + format2;
                } else {
                    format = atZone.format(DateTimeFormatter.ofPattern("MMM d, yyyy 'at' h:mm a"));
                }
            }
            format.getClass();
            return format;
        } catch (Exception unused) {
            return "Unknown schedule";
        }
    }

    public static final Info f(OfflineDownloadMetadata offlineDownloadMetadata) {
        String anistationId = offlineDownloadMetadata.getAnistationId();
        int anilistId = offlineDownloadMetadata.getAnilistId();
        Integer malId = offlineDownloadMetadata.getMalId();
        Title title = new Title(offlineDownloadMetadata.getAnimeTitle(), offlineDownloadMetadata.getAnimeTitle(), null, offlineDownloadMetadata.getAnimeTitle());
        CoverImage coverImage = new CoverImage(offlineDownloadMetadata.getCoverImage(), offlineDownloadMetadata.getCoverImage());
        String description = offlineDownloadMetadata.getDescription();
        MediaFormat format = offlineDownloadMetadata.getFormat();
        if (format == null) {
            format = MediaFormat.UNKNOWN;
        }
        MediaStatus mediaStatus = MediaStatus.UNKNOWN;
        Integer length = offlineDownloadMetadata.getLength();
        Integer seasonYear = offlineDownloadMetadata.getSeasonYear();
        nt1 nt1Var = nt1.x;
        return new Info(anistationId, anilistId, malId, title, coverImage, null, null, description, null, null, format, mediaStatus, null, length, null, null, null, null, seasonYear, nt1Var, nt1Var, null, null, false, null, nt1Var, nt1Var, nt1Var, nt1Var);
    }

    public static final String g(String str) {
        Instant instant;
        long between;
        if (str == null) {
            return "Unknown time";
        }
        if (str.length() != 0) {
            try {
                try {
                    instant = Instant.parse(str);
                } catch (DateTimeParseException unused) {
                    instant = LocalDate.parse(str).atStartOfDay(ZoneOffset.UTC).toInstant();
                }
                Instant now = Instant.now();
                if (instant.isAfter(now)) {
                    return "Just now";
                }
                long between2 = ChronoUnit.SECONDS.between(instant, now);
                long between3 = ChronoUnit.MINUTES.between(instant, now);
                long between4 = ChronoUnit.HOURS.between(instant, now);
                long between5 = ChronoUnit.DAYS.between(instant, now);
                long j = between5 / 7;
                ZoneId systemDefault = ZoneId.systemDefault();
                ZonedDateTime atZone = instant.atZone(systemDefault);
                ZonedDateTime atZone2 = now.atZone(systemDefault);
                long between6 = ChronoUnit.MONTHS.between(atZone, atZone2);
                between = ChronoUnit.YEARS.between(atZone, atZone2);
                if (between2 < 60) {
                    return "Just now";
                }
                if (between3 < 60) {
                    if (between3 == 1) {
                        return "1 minute ago";
                    }
                    return between3 + " minutes ago";
                }
                if (between4 < 24) {
                    if (between4 == 1) {
                        return "1 hour ago";
                    }
                    return between4 + " hours ago";
                }
                if (between5 < 7) {
                    if (between5 == 1) {
                        return "1 day ago";
                    }
                    return between5 + " days ago";
                }
                if (between6 < 1) {
                    if (j == 1) {
                        return "1 week ago";
                    }
                    return j + " weeks ago";
                }
                if (between6 < 12) {
                    if (between6 == 1) {
                        return "1 month ago";
                    }
                    return between6 + " months ago";
                }
                if (between == 1) {
                    return "1 year ago";
                }
            } catch (Exception unused2) {
                return "Unknown time";
            }
        }
        return between + " years ago";
    }
}
