package seafilewebapi;

/**
 * @author freezingrainyu
 * @version 1.0
 * @date 2019/04/18
 */
public class ListedLibraryInfo extends LibraryInfo {

    private String permission;
    private boolean virtual;

    public ListedLibraryInfo(String permission, boolean encrypted, long mtime, String owner, String id, long size, String name, String type, boolean virtual, String desc, String root) {
        super(encrypted, mtime, owner, id, size, name, type, desc, root);
        this.permission = permission;
        this.virtual = virtual;
    }

    public String getPermission() {
        return permission;
    }

    public boolean isVirtual() {
        return virtual;
    }
}