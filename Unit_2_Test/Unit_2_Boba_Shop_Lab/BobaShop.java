public class BobaShop {
    String shopName;
    BobaShopMember[] registeredMembers;

    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        BobaShopMember[] array = new BobaShopMember[initialCapacity];

        this.shopName = shopName;
        this.registeredMembers = array;
    }

    // getters and setters
    public String getShopName() {
        return shopName;
    }

    public String getName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public void setRegisteredMember(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    // methods
    public boolean isFull() {
        BobaShopMember[] members = getRegisteredMembers();

        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] members = getRegisteredMembers();
        BobaShopMember[] newMembers = new BobaShopMember[(members.length * 2)];

        for (int i = 0; i < members.length; i++) {
            newMembers[i] = members[i];
        }

        this.registeredMembers = newMembers;
    }

    public void registerMember(BobaShopMember member) {
        if (isFull()) {
            increaseCapacity();
        }
        
        BobaShopMember[] members = getRegisteredMembers();
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                break;
            }
        }
    }

    public void registerCustomer(BobaShopMember member) {
        registerMember(member);
    }

    public String toString() {
        BobaShopMember[] members = getRegisteredMembers();
        String toString = "== " + getShopName() + " Members ==\n";

        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                toString += members[i].toString() + "\n";
            }
        }
        
        return toString;
    }

    public boolean deleteMember(BobaShopMember member) {
        BobaShopMember[] members = getRegisteredMembers();
        
        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (members[i].getName().equals(member.getName())) {
                    members[i] = null;
                    return true;
                }
            }
        }
        
        return false;
    }
}