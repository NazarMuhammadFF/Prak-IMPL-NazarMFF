class Car implements VehicleInterface, DoorInterface {
    @Override
    public void drive() {
        // logic jalan
    }

    @Override
    public void stop() {
        // logic berhenti
    }

    @Override
    public void refuel() {
        // logic isi bensin
    }

    @Override
    public void openDoors() {
        // logic buka pintu
    }
}