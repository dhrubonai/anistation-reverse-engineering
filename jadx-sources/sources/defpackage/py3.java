package defpackage;

import androidx.work.OverwritingInputMerger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class py3 extends oy3 {
    public static final py3 b = new py3(11, 12, 0);
    public static final py3 c = new py3(12, 13, 1);
    public static final py3 d = new py3(15, 16, 2);
    public static final py3 e = new py3(16, 17, 3);
    public static final py3 f = new py3(1, 2, 4);
    public static final py3 g = new py3(3, 4, 5);
    public static final py3 h = new py3(4, 5, 6);
    public static final py3 i = new py3(6, 7, 7);
    public static final py3 j = new py3(7, 8, 8);
    public static final py3 k = new py3(8, 9, 9);
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py3(int i2, int i3, byte b2) {
        super(i2, i3);
        this.a = b2;
    }

    @Override // defpackage.oy3
    public final void migrate(x26 x26Var) {
        byte b2 = this.a;
        x26Var.getClass();
        switch (b2) {
            case 0:
                x26Var.v("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                x26Var.v("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                x26Var.v("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                x26Var.v("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                x26Var.v("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                x26Var.v("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                x26Var.v("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                x26Var.v("DROP TABLE `SystemIdInfo`");
                x26Var.v("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                x26Var.v(vz5.u("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                x26Var.v("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                x26Var.v("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                x26Var.v("DROP TABLE `WorkSpec`");
                x26Var.v("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                x26Var.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                x26Var.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                return;
            case 4:
                x26Var.v("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                x26Var.v("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                x26Var.v("DROP TABLE IF EXISTS alarmInfo");
                x26Var.v("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 5:
                x26Var.v("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 6:
                x26Var.v("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                x26Var.v("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 7:
                x26Var.v("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 8:
                x26Var.v("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                x26Var.v("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
                x26Var.v("CREATE TABLE IF NOT EXISTS `removed_watch_progress` (\n    `anilistId` INTEGER NOT NULL, \n    PRIMARY KEY(`anilistId`)\n)");
                return;
            case 11:
                x26Var.v("ALTER TABLE `anime_list` ADD COLUMN `anistationId` TEXT");
                x26Var.v("ALTER TABLE `watch_progress` ADD COLUMN `anistationId` TEXT");
                return;
            default:
                x26Var.v("CREATE TABLE IF NOT EXISTS `watch_progress_new` (\n    `id` TEXT NOT NULL,\n    `animeId` TEXT NOT NULL,\n    `anilistId` INTEGER NOT NULL,\n    `anistationId` TEXT,\n    `malId` INTEGER NOT NULL,\n    `animeTitle` TEXT,\n    `episodeTitle` TEXT NOT NULL,\n    `coverImage` TEXT,\n    `thumbnailImage` TEXT,\n    `episodeNumber` INTEGER NOT NULL,\n    `positionMs` INTEGER NOT NULL,\n    `durationMs` INTEGER NOT NULL,\n    `completed` INTEGER NOT NULL,\n    `updatedAt` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                x26Var.v("INSERT OR REPLACE INTO `watch_progress_new` (\n    `id`, `animeId`, `anilistId`, `anistationId`, `malId`, `animeTitle`,\n    `episodeTitle`, `coverImage`, `thumbnailImage`, `episodeNumber`, `positionMs`,\n    `durationMs`, `completed`, `updatedAt`\n)\nSELECT\n    (CASE\n        WHEN `anistationId` IS NOT NULL AND TRIM(`anistationId`) != ''\n            THEN TRIM(`anistationId`)\n        ELSE CAST(`anilistId` AS TEXT)\n    END) || ':' || `episodeNumber`,\n    CASE\n        WHEN `anistationId` IS NOT NULL AND TRIM(`anistationId`) != ''\n            THEN TRIM(`anistationId`)\n        ELSE CAST(`anilistId` AS TEXT)\n    END,\n    `anilistId`, `anistationId`, `malId`, `animeTitle`, `episodeTitle`, `coverImage`,\n    `thumbnailImage`, `episodeNumber`, `positionMs`, `durationMs`, `completed`, `updatedAt`\nFROM `watch_progress`\nORDER BY `updatedAt` ASC");
                x26Var.v("DROP TABLE `watch_progress`");
                x26Var.v("ALTER TABLE `watch_progress_new` RENAME TO `watch_progress`");
                x26Var.v("CREATE TABLE IF NOT EXISTS `anime_list_new` (\n    `animeId` TEXT NOT NULL,\n    `anilistId` INTEGER NOT NULL,\n    `anistationId` TEXT,\n    `malId` INTEGER,\n    `title` TEXT NOT NULL,\n    `coverImage` TEXT,\n    `bannerImage` TEXT,\n    `totalEpisodes` INTEGER,\n    `currentAiredEpisodes` INTEGER NOT NULL,\n    `mediaStatus` TEXT,\n    `watchStatus` TEXT NOT NULL,\n    `importedProgress` INTEGER NOT NULL,\n    `score` INTEGER NOT NULL,\n    `format` TEXT,\n    `notes` TEXT,\n    `createdAt` INTEGER NOT NULL,\n    `updatedAt` INTEGER NOT NULL,\n    PRIMARY KEY(`animeId`)\n)");
                x26Var.v("INSERT OR REPLACE INTO `anime_list_new` (\n    `animeId`, `anilistId`, `anistationId`, `malId`, `title`, `coverImage`,\n    `bannerImage`, `totalEpisodes`, `currentAiredEpisodes`, `mediaStatus`,\n    `watchStatus`, `importedProgress`, `score`, `format`, `notes`, `createdAt`, `updatedAt`\n)\nSELECT\n    CASE\n        WHEN `anistationId` IS NOT NULL AND TRIM(`anistationId`) != ''\n            THEN TRIM(`anistationId`)\n        ELSE CAST(`anilistId` AS TEXT)\n    END,\n    `anilistId`, `anistationId`, `malId`, `title`, `coverImage`, `bannerImage`,\n    `totalEpisodes`, `currentAiredEpisodes`, `mediaStatus`, `watchStatus`,\n    `importedProgress`, `score`, `format`, `notes`, `createdAt`, `updatedAt`\nFROM `anime_list`\nORDER BY `updatedAt` ASC");
                x26Var.v("DROP TABLE `anime_list`");
                x26Var.v("ALTER TABLE `anime_list_new` RENAME TO `anime_list`");
                x26Var.v("CREATE TABLE IF NOT EXISTS `removed_watch_progress_new` (\n    `animeId` TEXT NOT NULL,\n    PRIMARY KEY(`animeId`)\n)");
                x26Var.v("INSERT OR REPLACE INTO `removed_watch_progress_new` (`animeId`)\nSELECT CAST(`anilistId` AS TEXT) FROM `removed_watch_progress`");
                x26Var.v("DROP TABLE `removed_watch_progress`");
                x26Var.v("ALTER TABLE `removed_watch_progress_new` RENAME TO `removed_watch_progress`");
                return;
        }
    }
}
